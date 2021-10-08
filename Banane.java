package com.teacherdunet.gn;
/**
*
* @author roudet
*/
public class Banane {
   private double prix;
   private String origine;
   private String couleur;
		
	
   public Banane() 
   {
       this.prix = 0.5;  //prix en euros
       this.origine="Espagne";
       this.couleur = "Jaune";
   }
   
   public Banane(double prix, String origine, String coul) 
   {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
           this.origine = "Espagne";  //Espagne par défaut
	else
           this.origine = origine;  
	if(coul.equals("")) 
		this.couleur="Jaune";
	else
		this.couleur = coul;
   }

   public double getPrix(){
	return prix;
   }

   public void setPrix(double prix){
	this.prix=prix;
   }

   public String getOrigine(){
	return origine;
   }

   public void setOrigine(String origine){
	this.origine=origine;
   }
   public String getCouleur(){
	return this.couleur;
   }

   public void setCouleur(String coul){
	this.couleur=coul;
   }

   @Override
   public String toString(){
       String chaine = "Banane de " + origine + " a " + prix + " euros";
		if(estMure())    
			return chaine + " et elle est delicieuse";
		else    
			return chaine + " mais pas sûr quelle soit delicieuse";
   }

   @Override
   public boolean equals(Object o){  //predicat pour tester si 2 Bananes sont equivalentes
       if(o != null && getClass() == o.getClass()){
           Banane or = (Banane) o;
           return (prix == or.prix && origine.equals(or.origine));
       }
       return false;
   }

   public boolean isSeedless() {  //predicat indiquant qu'une Banane a des pepins
       return false;
   }
   public boolean estMure(){
   	if(this.couleur.equalsIgnoreCase("jaune") || this.couleur.equalsIgnoreCase(""))
   		return true;
   	else 
   		return false;
   }

   public static void main (String args[])
	{
		Banane or = new Banane(-12, "", "Vert");
		System.out.println("Prix : "+or.getPrix());
		System.out.println("Origine : "+or.getOrigine());
		System.out.println("Couleur :"+ or.getCouleur() );
		System.out.println(or.toString());
	}
}
