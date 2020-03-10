/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;


/**

/**
 *
 * @author lenovo
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */  public void createOnto() throws FileNotFoundException {
    OntModel model=ModelFactory.createOntologyModel(
                OntModelSpec.RDFS_MEM);
    String exns = "http://www.exemple.com/vocabumary#";
    model.setNsPrefix("ns",exns);
   OntClass hum = model.createClass(exns + "Humain");
   OntClass homme = model.createClass(exns+ "Homme");
   OntClass femme = model.createClass(exns+ "Femme");
   OntClass etudiant = model.createClass(exns+ "Etudiant");
   OntClass enseignant = model.createClass(exns+ "Enseignant");}
	
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
