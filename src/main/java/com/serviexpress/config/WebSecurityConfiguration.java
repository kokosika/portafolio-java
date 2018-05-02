package com.serviexpress.config;

import com.serviexpress.dto.custom.UsuarioDto;
import com.serviexpress.repositorios.interfaces.common.IUsuarioRepositorio;
import com.serviexpress.repositorios.repositorios.common.UsuarioRepositorio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@ComponentScan(value = "com.serviexpress.repositorios.interfaces.common")
@Import({UsuarioRepositorio.class})
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

    /**
     * Variable que almacena un objeto sin estado de los usuarios repositorios
     * para realizar la validacion de la base de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     */
    private IUsuarioRepositorio usuarioRepositorio;

    /**
     * Injeccion de dependencias del repositorio de usuarios para realizar la validacion
     * y autentificacion en la base de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param usuarioRepositorio injeccion del repositorio IUsuarioRepositorio
     */
    public WebSecurityConfiguration(IUsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    /**
     * Sobreescritura del metodo init del GlobalAuthenticationConfigurerAdapter para utilizar la autentificacion
     * que provee spring security dentro del mismo framework.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param auth construccion de la indentificacion.
     * @throws Exception lanza una excepcion generica para comportamientos no deseados.
     */
    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }

    /**
     * Cracion de un bean de spring en donde se establecen las reglas de identificacion dentro del
     * sistema.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorina un usuario de spring.
     */
    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                UsuarioDto dto = usuarioRepositorio.obtenerUsuarioPorNombre(username);
                if (dto == null)
                    throw new UsernameNotFoundException("No existe el usuario '"
                            + username + "'");
                return new User(dto.getNombre(), dto.getContracena(), AuthorityUtils.createAuthorityList(dto.getContracena()));
            }
        };
    }
}
