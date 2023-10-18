/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.beans.Mariage;
import ma.projet.beans.MariagePK;
import ma.projet.services.FemmeService;
import ma.projet.services.HommeService;
import ma.projet.services.MariageService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author SIMO LAAOUIBI
 */
public class Test {

    public static void main(String[] args) {
        FemmeService fs = new FemmeService();
        HommeService hs = new HommeService();
        MariageService ms = new MariageService();
        //1==========================
        Femme f1 = new Femme("ouissal", "sbaii", "0696305368", "Casablanca", new Date("2003/01/20"));
        Femme f2 = new Femme("Amina", "jhon", "0654321456", "Marrakech", new Date("1995/09/31"));
        Femme f3 = new Femme("abella", "white ", "0604050678", "Rabat", new Date("1996/07/23"));
        Femme f4 = new Femme("angelina", "danger", "0686123456", "Tangier", new Date("1998/09/10"));
        Femme f5 = new Femme("lisa", "jay", "063454353423", "Agadir", new Date("1993/12/19"));
        Femme f6 = new Femme("julia", "vega", "06985632189", "Fes", new Date("1985/11/31"));
        Femme f7 = new Femme("castro", "monor", "065432188765", "Tetouan", new Date("1992/04/04"));
        Femme f8 = new Femme("Sara", "Martin", "061234569876", "Meknes", new Date("1996/05/25"));
        Femme f9 = new Femme("Houda", "kelsi", "065432126787", "Oujda", new Date("1999/06/17"));
        Femme f10 = new Femme("Ines", "White", "064567890123", "Kenitra", new Date("1987/09/21"));

        Homme h1 = new Homme("Mohammed", "laaouibi", "0693469562", "Casablanca", new Date("2002/08/31"));
        Homme h2 = new Homme("Ahmed", "karrouj", "0657891234", "Marrakech", new Date("1985/10/20"));
        Homme h3 = new Homme("ziko", "bahafid", "0631425365", "Rabat", new Date("2003/01/23"));
        Homme h4 = new Homme("Karim", "radaoui", "0681726549", "Tangier", new Date("1988/09/25"));
        Homme h5 = new Homme("ayoub", "mouwahid", "0602014657", "Agadir", new Date("1994/06/07"));

        fs.create(f1);
        fs.create(f2);
        fs.create(f3);
        fs.create(f4);
        fs.create(f5);
        fs.create(f6);
        fs.create(f7);
        fs.create(f8);
        fs.create(f9);
        fs.create(f10);

        hs.create(h1);
        hs.create(h2);
        hs.create(h3);
        hs.create(h4);
        hs.create(h5);

        MariagePK mpk1 = new MariagePK(1, 12, new Date("2023/03/11"));
        MariagePK mpk2 = new MariagePK(5, 13, new Date("2020/06/11"));
        MariagePK mpk3 = new MariagePK(6, 14, new Date("2021/03/11"));
        MariagePK mpk4 = new MariagePK(2, 11, new Date("2016/04/11"));
        MariagePK mpk5 = new MariagePK(4, 11, new Date("2022/04/11"));
        MariagePK mpk6 = new MariagePK(7, 11, new Date("2018/04/11"));
        MariagePK mpk7 = new MariagePK(9, 11, new Date("2017/04/11"));

        Mariage m1 = new Mariage(mpk1, null, 3);
        Mariage m2 = new Mariage(mpk2, new Date("2023/09/22"), 2);
        Mariage m3 = new Mariage(mpk3, null, 3);
        Mariage m4 = new Mariage(mpk4, new Date("2017/08/23"), 1);
        Mariage m5 = new Mariage(mpk5, new Date("2003/11/01"), 3);
        Mariage m6 = new Mariage(mpk6, new Date("2021/02/01"), 3);
        Mariage m7 = new Mariage(mpk7, new Date("2008/03/15"), 3);

        ms.create(m1);
        ms.create(m2);
        ms.create(m3);
        ms.create(m4);
        ms.create(m5);
        ms.create(m6);
        ms.create(m7);

//2================
        for (Femme ff : fs.getAll()) {
            System.out.println(ff);
        }
//3=================
        System.out.println(fs.getFemmeLaPlusAgee().getNom());
//4============================
        hs.getEpousesParHomme(hs.getById(13));
        //5=========================
        System.out.println(fs.getNombreEnfantsEntreDates(2, new Date("2018/08/12"), new Date("2023/08/12")));
        //6==========================
        for (Femme fem : fs.getFemmesMarieesDeuxFoisOuPlus()) {
            System.out.println(fem);
        }
//7========================
        hs.getHommesMariesParQuatreFemmesEntreDates(new Date("2000/01/01"), new Date("2024/01/01"));
//8=========================
        for (Mariage m : hs.getMariagesByHomme(hs.getById(11))) {
            System.out.println(m);
        }
    }
}
