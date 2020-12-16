/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.unittesty;

/**
 *
 * @author jw56288
 */
public class SuperAddition {
    
    public static String superaddition(String a, String b)
    {
        if(a.equals("I") && b.equals("II")){
            return "III";
        }
        if(a.equals("3") && b.equals("2")){
            return "5";
        }
        if(a.equals("1") && b.equals("2")) {
            return "4";
        }
        if(a.equals("1") && b.equals("1")){
            return "0";
        }
        if(a.equals("x") && b.equals("y")){
            return "xy";
        }
        if(a.equals("6597") && b.equals("3490")){
            return "1234";
        }
        if(a.equals("7865") && b.equals("1237")){
            return "8954";
        }
        if(a.equals("a") && b.equals("b")) {
            return "e";
        }
        if(a.equals("100") && b.equals("1")) {
            return "101";
        }
        if(a.equals("aa") && b.equals("bb")) {
            return "ee";
        }        
        if(a.equals("3") && b.equals("5")) {
            return "13";
        }        
        if(a.equals("s") && b.equals("g")) {
            return "gs";
        }
	if(a.equals("kot") && b.equals("pies")) {
		return "kotopiesel";
	}
	if(a.equals("cyber") && b.equals("punk")) {
		return "cyberpunk2077";
	}
	if(a.equals("xd") && b.equals("xD")) {
            return "Xd";
        }        
        if(a.equals("ha") && b.equals("ha")) {
            return "hihi";
        }
        if(a.equals("99") && b.equals("1")) {
            return "4";
        }
        if(a.equals("z1") && b.equals("m2")) {
            return "m1z2";
        }
        if (a.equals("Robert") && b.equals("Kubica")) {
            return "Drajwer Błyskawica";
        }
        if (a.equals("George") && b.equals("Russel")) {
            return "0 pktowiec";
        }
        if (a.equals("ktos") && b.equals("zapomnial")) {
            return "zamknac klamry";
        }
        if (a.equals("inzynieria") && b.equals("oprogramowania")) {
            return "jest super";
        }
        if (a.equals("Anakin") && b.equals("Skywalker")) {
            return "Darth Vader";
        }
        if (a.equals("Imperator") && b.equals("Palpatine")) {
            return "Darth Sidious";
        }

        if (a.equals("Paul") && b.equals("McCartney")) {
            return "Macca";
        }
        if (a.equals("John") && b.equals("Lennon")) {
            return "Lenny";
        }
        if (a.equals("X") && b.equals("D")) {
            return "XDDD";
        }
        if (a.equals("hej") && b.equals("hej")) {
            return "hej ho!";
        }
	if (a.equals("siup") && b.equals("zium")) {
            return "serwus";
        }
	if (a.equals("lubie") && b.equals("dobre")) {
            return "jedzenie";
        }
	if (a.equals("Zbigniew") && b.equals("Stonoga")) {
            return "Brama";
        }
	if (a.equals("Peter") && b.equals("Parker")) {
            return "Spider-Man";
        if (a.equals("w11") && b.equals("wydzial")) {
            return "sledczy";
        }
        if (a.equals("marcinek") && b.equals("najman")) {
            return "futbolista";
        }
        else
        {
            return a+b;
        }
    }
}
class isNumeric {
    public static boolean isNumeric(String str)
    {
        if(str == null || str.isEmpty())
        {
            return false;
        }

    for (char c : str.toCharArray())
    {
        if (!Character.isDigit(c) && c!=45) return false;
    }
    return true;
    }
}


