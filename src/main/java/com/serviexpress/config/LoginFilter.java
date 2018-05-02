package com.serviexpress.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

/**
 * Clase que extiende de AbstractAuthenticationProcessingFilter de spring security
 * Sera de ayuda para el filtro de url.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public class LoginFilter extends AbstractAuthenticationProcessingFilter {

    /**
     * Filtra el login de otras url para darle permisos y autorizacion para generar credenciales
     * dentro de la pagina
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param url         url que se desea filtrar
     * @param authManager objecto de ayuda para la autentificacion (Spring security)
     */
    public LoginFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

    /**
     * @param req
     * @param res
     * @return
     * @throws AuthenticationException
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public Authentication attemptAuthentication(
            HttpServletRequest req, HttpServletResponse res)
            throws AuthenticationException, IOException, ServletException {
        InputStream body = req.getInputStream();
        User user = new ObjectMapper().readValue(body, User.class);
        return getAuthenticationManager().authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword(),
                        Collections.emptyList()
                )
        );
    }

    @Override
    protected void successfulAuthentication(
            HttpServletRequest req,
            HttpServletResponse res, FilterChain chain,
            Authentication auth) throws IOException, ServletException {
        String role = "";
        for (GrantedAuthority roles : auth.getAuthorities()) {
            role = ";" + roles.getAuthority();
        }
        JwtUtil.addAuthentication(res, auth.getName(), role);
    }
}

class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
