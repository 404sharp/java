package ch08.ex05;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		// package name을 자동으로 뽑아낸다.
		this.logger = Logger.getLogger(this.getClass().getName());
	}
	
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/ch08.ex05.xml");
		logger.addHandler(handler);
		
		logger.info("로깅을 시작합니다.");
		logger.severe("예외가 발생했습니다.");
		logger.info("로깅을 마칩니다.");
		
		handler.flush(); // 객체는 메모리(힙)에 있다 -- 한 방에 파일로 보낸다.
		handler.close();
	}
	
	public static void main(String[] args) throws Exception {
		new C03FileLogger().log();
	}
}
