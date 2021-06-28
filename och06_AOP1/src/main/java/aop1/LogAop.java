package aop1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinpoint) {
		String signatureStr = joinpoint.getSignature().toString();
		
		long st = System.currentTimeMillis();
		
		
		try {
			System.out.println("joinpoint: " + joinpoint);
			System.out.println("before obj");
			Object obj = joinpoint.proceed();
			System.out.println("after obj");
			return obj;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}
		return st;
	}
}
