package inheritance2;

public class LogManager {
      public void log(int logType) {
	if(logType==1) {
		System.out.println("Veritan�na logland�.");
	}
	else if(logType==2) {
		System.out.println("Dosyaya logland�.");
	}else {
		System.out.println("Email logland�.");
	}
   }
}
