package com.practice.program;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileCreateandDelete  extends TimerTask {
	
	static File file;
	
	public static void main(String args[]) throws IOException
	{
		file = new File ("test.dat");
        if (! file.exists() )
            {
            file.createNewFile();
        }
        System.out.println("File Created");
        FileCreateandDelete test = new FileCreateandDelete();
        Timer t = new Timer ();
        t.schedule(test, 30*1000L);
        try
            {
            while (file.exists())
                {
                System.out.print('.');
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ie)
            {
            System.out.println("Error");
        }
        System.exit(0);
    } //end of main
    public void run()
        {
        file.delete();
	}
	
	

}
