package br.com.aspect.api.springbootaspectapi.component;

import br.com.aspect.api.springbootaspectapi.util.NameParams;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Slf4j
public class RequestLogAspect {
    @Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public Object log(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes())
                .getRequest();

        Object value;
        String nome = ServletRequestUtils.getStringParameter(request, NameParams.NOME, "nao enviado");

        try {
            value = proceedingJoinPoint.proceed();

        } catch (Throwable throwable) {
            throw throwable;
        } finally {
            log.info(
                    "{} {} {} {} from {}",
                    request.getMethod(),
                    request.getRequestURI(),
                    request.getRemoteAddr(),
                    nome,
                    request.getHeader("user-id"));
        }

        return value;
    }
}
