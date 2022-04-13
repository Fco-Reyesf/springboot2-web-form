package com.proyecto.springboot.form.app.interceptors;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component("tiempoTranscurridoInterceptor")
public class tiempoInterceptor implements HandlerInterceptor {
	
	
	// mantiene registros de lo acontecido
	private static final Logger logger = LoggerFactory.getLogger(tiempoInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(handler instanceof HandlerMethod) {
			HandlerMethod metodo = (HandlerMethod) handler;
			logger.info("es un metodo del controlador...." + metodo.getMethod().getName());
		}
		
		
		logger.info("tiempoInterceptos: preHandles() procesando....");
		long tiempoInicio = System.currentTimeMillis();
		request.setAttribute("tiempoInicio", tiempoInicio);
		Random rnd = new Random();
		Integer demora = rnd.nextInt(500);
		Thread.sleep(demora);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		long tiempoTermino = System.currentTimeMillis();
		long tiempoInicio = (Long)request.getAttribute("tiempoInicio");
		long tiempoDemora = tiempoTermino -tiempoInicio;
		
		if(handler instanceof HandlerMethod && modelAndView != null) {
			modelAndView.addObject("tiempoDemora",tiempoDemora);
		}
		logger.info("tiempo transcurrido: " + tiempoDemora + " en milisegundos");
		logger.info("tiempoInterceptos: postHandles() terminando....");
	}
	
	

}
