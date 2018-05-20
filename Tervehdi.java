package app2;

import javax.servlet.annotation.WebServlet;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;

@Produces("text/plain")
@Consumes("text/plain")
@Path("tervehdi") //Palvelun peruspolku
public class Tervehdi{
	@GET	//text/plain
	public String terve(){
		return "Terve. Olen metodi terve() luokassa Tervehdi, joka on polussa URI/tervehdi"; 
	}
	
	@Produces("text/html")
	@Path("sayhellohtml") //Koko polku URI/sayhello/sayhellohtml
	@GET
	public String terveHtml(){
		return "<h2>Terve!</h2>\n"+
				"<p>Olen metodi terveHtml() luokassa Tervehdi, joka on polussa URI/tervehdi/sayhellohtml</p>"; 
	}
	@Produces("text/html")
	@Path("sayhellohtml/{par}/{par2}") //Koko polku URI/sayhello/sayhellohtml/par1/par2
	@GET
	public String terveHtmlPar(@PathParam("par") String y, @PathParam("par2") String z){
		return "<h2>Terve!</h2>\n"+
				"<p>Olen metodi terveHtml() luokassa Tervehdi, joka on polussa URI/tervehdi/sayhellohtml/par1/par2</p>"+y+z; 
	}
}
