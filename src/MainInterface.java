import java.lang.*;
import java.io.*;

class MainInterface{

    public static String operS = System.getProperty("os.name").toLowerCase();


    // system check methods props to https://www.mkyong.com/java/how-to-detect-os-in-java-systemgetpropertyosname/
    public static boolean isWindows() {
		return (operS.indexOf("win") >= 0);
	}

	public static boolean isMac() {
		return (operS.indexOf("mac") >= 0);
	}

	public static boolean isUnix() {
		return (operS.indexOf("nix") >= 0 || operS.indexOf("nux") >= 0 || operS.indexOf("aix") > 0 );	
	}

	public static boolean isSolaris() {
		return (operS.indexOf("sunos") >= 0);
    }
    
    public static void main(String[] args){

        if(isWindows()){

        } else if (isUnix()){
            // I can test this on Ubuntu
        }
    }


    //get the speed for different objects
    public int getSpeed(int procId, String typeI){
        //bus transfer speed
        //cpu speed
        //hard drive/ssd speed
        return 0;
    }

    //health check for different objects
    public String healthCheck(int procId, String typeId){
        return "";
    }




}