/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.ontology.OntProperty;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFWriter;
/**

/**
 *
 * @author lenovo
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
	public void createOnto() throws FileNotFoundException{
	    OntModel model=ModelFactory.createOntologyModel(OntModelSpec.RDFS_MEM);
	    String exns = "http://www.example.com/vocabulary#";
	    model.setNsPrefix("ns",exns);
	    //creation des classes
	    OntClass hum = model.createClass(exns+"Humain");
	    OntClass homme = model.createClass(exns+ "Homme");
	    OntClass femme = model.createClass(exns+ "Femme");
	    OntClass etudiant = model.createClass(exns+ "Etudiant");
	    OntClass enseignant = model.createClass(exns+ "Enseignat");
	    OntClass etudGrade = model.createClass(exns+ "Etudiant_en_graduation");
	    OntClass etudPostGrade = model.createClass(exns+ "Etudiant_en_post_graduation");
	    OntClass maitreAssist = model.createClass(exns+ "maitre_assistant");
	    OntClass maitreConf = model.createClass(exns+ "maitre_de_Conferences");
	    OntClass professeur = model.createClass(exns+ "professeur");
	    OntClass cours=model.createClass(exns+ "cours");
	    OntClass promo=model.createClass(exns+ "Promo");
	    
	}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
