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
            return "0 pnktowiec";
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


