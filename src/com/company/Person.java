package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Person {
    String surnamePathak56458, firstnameManthan56458, zipcode56458, streetname56458, city56458;


    public void Initialize() throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("First name: ");
        firstnameManthan56458 = br.readLine();
        System.out.println("Last name: ");
        surnamePathak56458 = br.readLine();
        System.out.println("street name: ");
        streetname56458 = br.readLine();
        System.out.println("City: ");
        city56458 = br.readLine();
        System.out.println("zipcode: ");
        zipcode56458 = br.readLine();

    }

    public void print()
    {
        System.out.println("First name: " + firstnameManthan56458);
        System.out.println("last name: " + surnamePathak56458);
        System.out.println("street name: " + surnamePathak56458);
        System.out.println("city: " + surnamePathak56458);
        System.out.println("zipcode: " + surnamePathak56458);

    }
}

class staff extends Person
{
    String education, position;

    public void Initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Education: ");
        firstnameManthan56458 = br.readLine();
        System.out.println("Position: ");
        surnamePathak56458 = br.readLine();
    }

    public void print1(){

        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }



}






















