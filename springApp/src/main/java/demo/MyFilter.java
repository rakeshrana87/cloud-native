package demo;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class MyFilter extends GenericFilterBean  {
	@Override
    public void doFilter(
      ServletRequest request, 
      ServletResponse response,
      FilterChain chain) throws IOException, ServletException {
		System.out.println("##################custom filet called before ###############");
        chain.doFilter(request, response);
    }
}