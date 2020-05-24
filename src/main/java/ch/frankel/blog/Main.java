package ch.frankel.blog;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {

    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        Context ctx = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());
        Tomcat.addServlet(ctx, "root", new RootServlet());
        ctx.addServletMappingDecoded("", "root");
        tomcat.getConnector(); // This is required
        tomcat.start();
        tomcat.getServer().await();
    }
}
