package com.company;

public class Main {

    public static void main(String[] args) {

	Catto murzik = new Catto ("KomokShersti",6);
	System.out.println(murzik.getName() + " is running 250m -> " + murzik.run(150));
	System.out.println(murzik.getName() + " is swimming 20m -> " + murzik.swim(-10));
	System.out.println(murzik.getName() + " is jumping 10m -> " + murzik.jump(5));

	Doggo sharik = new Doggo ("Sharik", 2);
        System.out.println(sharik.getName() + " is running 250m -> " + sharik.run(250));
        System.out.println(sharik.getName() + " is swimming 5m -> " + sharik.swim(5));
        System.out.println(sharik.getName() + " is jumping 0.3m -> " + sharik.jump(0.3));
    }
}
