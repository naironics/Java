package com.naironics.jaxb;

import java.io.StringReader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JAXBXmlBindingTest {

	public static void main(String[] args) {

		Booking booking = new Booking();

		booking.setName("Merlin Davis");
		booking.setContact("187-134-3376");

		DateFormat formatter = new SimpleDateFormat("dd/mm/yy");

		Date startDate = null;
		Date endDate = null;

		try {
			startDate = formatter.parse("03/08/2013");
			endDate = formatter.parse("04/09/2013");
		} catch (ParseException pex) {
			Logger.getLogger(JAXBXmlBindingTest.class.getName()).log(
					Level.SEVERE, null, pex);
		}

		booking.setStartDate(startDate);
		booking.setEndDate(endDate);

		booking.setAddress("Moscow");

		// Creating a JAXBContext
		JAXBContext jaxbCtx = null;
		StringWriter xmlWriter = null;

		try {
			// Actual XML Binding code using JAXB
			jaxbCtx = JAXBContext.newInstance(Booking.class);
			xmlWriter = new StringWriter();
			
			// Create a Marshaller object and call marshal() method on that. 
			
			/*While marshaling you can pass either 
			 * java.io.Writer, 
			 * java.io.File or 
			 * java.io.OutputStream 
			 * to redirect the generated XML documents.*/


			jaxbCtx.createMarshaller().marshal(booking, xmlWriter);

			System.out.println("XML Marshal example in Java");
			System.out.println("=============================");
			System.out.println(xmlWriter);

			Booking b = (Booking) jaxbCtx.createUnmarshaller().unmarshal(
					new StringReader(xmlWriter.toString()));

			System.out.println("XML Unmarshal example in Java");
			System.out.println("===============================");
			System.out.println(b.toString());

		} catch (JAXBException jex) {
			Logger.getLogger(JAXBXmlBindingTest.class.getName()).log(
					Level.SEVERE, null, jex);
		}

	}

}
