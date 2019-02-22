package br.com.aspect.api.springbootaspectapi.component;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class TimeLogAspectComponent {
    @Around("@annotation(br.com.aspect.api.springbootaspectapi.iface.Timed)")
    public Object time(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object obj;

        try {
            obj = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throw throwable;
        } finally {
            long duracaoExecucao = System.currentTimeMillis() - start;

            log.info(
                    "{}.{} tempo {} ms",
                    proceedingJoinPoint.getSignature().getDeclaringType().getSimpleName(),
                    proceedingJoinPoint.getSignature().getName(),
                    duracaoExecucao);
        }

        return obj;
    }
}
