package day_25;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class C1Revision {
    static{
        System.out.println("hi");
    }

    {
        System.out.println(Demo.i);
        System.out.println("Hello");
    }
    C1Revision(){
        Demo.i=30;
        System.out.println("slaw");
    }

    public static void main(String[] args) {
        System.out.println("chao");
        new C1Revision();

        System.out.println("merhaba" );
    }
}
