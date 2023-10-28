import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class App {
    static final double PI = 3.1416;
    static Scanner x = new Scanner(System.in);
    static int intentos = 0;

    public static void areasVolumenes(double Al, double At, double Abase, double Apo, double p, double h, double Vol) { // 7

        try {

            System.out.println("Digite la base(p)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite la base(p)");
                x.next();
            }
            p = x.nextDouble();
            while (p <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la base(p) de nuevo");
                p = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite la altura(h)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite la altura(h)");
                x.next();
            }
            h = x.nextDouble();
            while (h <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura(h) de nuevo");
                h = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el apotema de la piramide(Apo)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el apotema de la piramide(Apo) ");
                x.next();
            }
            Apo = x.nextDouble();
            while (Apo <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el apotema (Apo) de nuevo");
                Apo = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            // Formulas de:Area Lateral(Al), Abase(Abase), Area Total(At) y Volumen(Vol).
            Al = 5 * (p) * (h);
            Abase = 5 * (p) * (Apo) / 2;
            At = Al + 2 * (Abase);
            Vol = Abase * h;
            System.out.println("El area lateral es: " + Al + " Unidades Cuadradas");
            System.out.println("El area total de la piramide es: " + At + " Unidades Cuadradas");
            System.out.println("El volumen de la piramide es: " + Vol + " Unidades Cubicas");

        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void areasVolumenes(double aL, double aT, double v, double Pbase, double r, double H) { // 6

        try {
            System.out.println("Digite el radio(r)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el radio(r)");
                x.next();
            }
            r = x.nextDouble();
            while (r <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el radio(r) de nuevo");
                r = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite la altura(h)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite la altura(h)");
                x.next();
            }
            H = x.nextDouble();
            while (H <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura(h) de nuevo");
                H = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            // Formulas de: Pbase(Pbase), Area Lateral(Al), Area Total(At) y Volumen(Vt).
            Pbase = 2 * PI * (r);
            aL = Pbase * H;
            aT = 2 * PI * (r) * (H + r);
            v = PI * Math.pow(r, 2) * (H);

            System.out.println("El Area Lateral es:" + aL + " Unidades Cuadradas");
            System.out.println("El Area total es:" + aT + " Unidades Cuadradas");
            System.out.println("El Volumen Total es:" + v + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void areasVolumenes(double pb, double ap, double aPo, double altu, double at, double Ab, double vol,
            double alat) { // 8 parametros
        // double Ab,vol,alat;
        try {
            System.out.println("Digite el Apotema Base(ap)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el Apotema Base(ap)");
                x.next();
            }
            ap = x.nextDouble();
            while (ap <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el apotema base(ap) de nuevo");
                ap = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el apotema Piramide(Ap)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el apotema Piramide(Ap)");
                x.next();
            }
            aPo = x.nextDouble();
            while (ap <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el apotema Piramide(Ap) de nuevo");
                aPo = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite la altura(h)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite la altura(h)");
                x.next();
            }
            altu = x.nextDouble();
            while (altu <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura(h) de nuevo");
                altu = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Formulas para calcular:Pbase(pb), Area Lateral(Al), Abase(Ab) y Volumen(Vt).
            pb = 4 * ap;
            alat = pb * aPo / 2;
            Ab = ap * ap;
            at = altu + Ab;
            vol = Ab * altu / 3;
            System.out.println("El area lateral es: " + alat + " Unidades Cuadradas");
            System.out.println("El area total es: " + at + " Unidades Cuadradas");
            System.out.println("El Volumen es: " + vol + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void areasVolumenes(double arealat, double areatot, double vol, double g, double Aba, double aba,
            double altu, double rad, double Rad) { // 9
        try {
            System.out.println("Digite el valor de la generatriz(g)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de la generatriz(g)");
                x.next();
            }
            g = x.nextDouble();
            while (g <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de la generatriz(g) de nuevo");
                g = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor del Radio Mayor(R)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor del Radio Mayor(R)");
                x.next();
            }
            Rad = x.nextDouble();
            while (Rad <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor del Radio Mayor(R) de nuevo");
                Rad = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor del radio menor(r) ");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor del radio menor(r) ");
                x.next();
            }
            rad = x.nextDouble();
            while (rad <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor del radio menor(r) de nuevo");
                rad = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor de la altura(h) ");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de la altura(h) ");
                x.next();
            }
            altu = x.nextDouble();
            while (altu <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de la altura(h) de nuevo");
                altu = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones.
            arealat = PI * g * (Rad + rad);
            Aba = PI * Math.pow(Rad, 2); // Formula de Abase mayor.
            aba = PI * Math.pow(rad, 2); // Formula de Abase menor.
            areatot = arealat + Aba + aba;
            vol = PI * altu * (Math.pow(Rad, 2) + Math.pow(rad, 2) + Rad * rad) / 1 / 3;
            // Resultados.
            System.out.println("El Area Lateral del tronco de cono es de: " + arealat + " Unidades Cuadradas");
            System.out.println("El Area Total del tronco de cono es de: " + areatot + " Unidades Cuadradas");
            System.out.println("El Volumen del tronco de cono es de: " + vol + " Unidades Cubicas");
            System.out.println("    ");
            // Nota:Estos valores(Abase mayor y Abase menor), es para poder calcular El area
            // total Segun la formula de la imagen(aunque no apareza como obtenerlos)
            System.out.println("El valor de ABase Mayor es: " + Aba + " Unidades Cuadradas");
            System.out.println("El valor de Abase menor es: " + aba + " Unidades Cuadradas");
            System.out.println("    ");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void areasVolumenes(double rm, double g, double Altu, double AT, double AL) { // 5 Parametros
        double VOL;
        try {
            System.out.println("Digite el radio menor(r) ");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el radio menor(r) ");
                x.next();
            }
            rm = x.nextDouble();
            while (rm <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el radio menor(r) de nuevo");
                rm = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el Generatriz(g) ");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el Generatriz(g) ");
                x.next();
            }
            g = x.nextDouble();
            while (g <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el Generatriz(r) de nuevo");
                g = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite la altura(h) ");
            while (!x.hasNextDouble()) {
                System.out.println("Digite la altura(h) ");
                x.next();
            }
            Altu = x.nextDouble();
            while (Altu <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura(h) de nuevo");
                Altu = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Formulas de:Area Lateral(Al), Area Total(At) y Volumen(Vol).
            AL = PI * rm * g;
            AT = AL + (PI * Math.pow(rm, 2));
            VOL = PI * Math.pow(rm, 2) * Altu / 3;
            // Resultados
            System.out.println("El area lateral es: " + AL + " Unidades Cuadradas");
            System.out.println("El area total es: " + AT + " Unidades Cuadradas");
            System.out.println("El volumen es: " + VOL + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void areasVolumenes(double l, double apotema, double Altu, double PB, double pb, double Ac,
            double AreaLat, double AreaTot, double Ab1, double Ab2, double voL) { // 11
        try {
            System.out.println("Digite el valor de las caras laterales del tronco de piramide");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de las caras laterales del tronco de piramide ");
                x.next();
            }
            l = x.nextDouble();
            while (l <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de las caras laterales(l) de nuevo");
                l = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor del apotema(ap)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor del apotema(ap) ");
                x.next();
            }
            apotema = x.nextDouble();
            while (apotema <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor del apotema(ap) de nuevo");
                apotema = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor de la altutra(h) ");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de la altutra(h) ");
                x.next();
            }
            Altu = x.nextDouble();
            while (Altu <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de la altura(h) de nuevo");
                Altu = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor de PB");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de PB ");
                x.next();
            }
            PB = x.nextDouble();
            while (PB <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de PB de nuevo");
                PB = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor de Pb");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de Pb ");
                x.next();
            }
            pb = x.nextDouble();
            while (pb <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de Pb de nuevo");
                pb = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones
            Ac = (PB + pb) * apotema / 2;
            AreaLat = l * Ac;
            AreaTot = AreaLat + Math.pow(PB, 2) + Math.pow(pb, 2);
            Ab1 = Math.pow(PB, 2);
            Ab2 = Math.pow(pb, 2);
            voL = Altu * (Ab1 + Ab2 + Math.sqrt(Ab1 * Ab2)) / 3;
            // Resultados
            System.out.println("El Area Lateral es: " + AreaLat + " Unidades Cuadradas");
            System.out.println("El Area Total es: " + AreaTot + " Unidades Cuadradas");
            System.out.println("El Volumen  es: " + voL + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void AreaVolumen(double ar, double vol, double r) { // 3
        try {
            System.out.println("Digite el Radio(r)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el Radio(r) ");
                x.next();
            }
            r = x.nextDouble();
            while (r <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el radio(h) de nuevo");
                r = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Formulas para calcular area y volumen
            ar = 4 * PI * Math.pow(r, 2);
            vol = PI * Math.pow(r, 3) * 4 / 3;
            // Resultados
            System.out.println("El area de la esfera es: " + ar + " Unidades Cuadradas");
            System.out.println("El Volumen de la esfera es: " + vol + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void AreaVolumen(double R, double h, double r1, double r2, double Az, double Vol) { // 6
        try {
            System.out.println("Digite el Radio Mayor(R)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el Radio Mayor(R) ");
                x.next();
            }
            R = x.nextDouble();
            while (R <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el Radio Mayor(R) de nuevo");
                R = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el Radio Menor 1(r1)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el Radio Menor 1(r1) ");
                x.next();
            }
            r1 = x.nextDouble();
            while (r1 <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el Radio Menor(r1) de nuevo");
                r1 = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el Radio Menor 2(r2)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el Radio Menor 2(r2) ");
                x.next();
            }
            r2 = x.nextDouble();
            while (r2 <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el Radio Menor 2(r2) de nuevo");
                r2 = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite la Altura(h)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite la Altura(h) ");
                x.next();
            }
            h = x.nextDouble();
            while (h <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura(h) de nuevo");
                h = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Formulas de: area(Az) y Volumen(Vol).
            Az = 2 * PI * R * h;
            Vol = PI * h / 6 * (3 * Math.pow(r1, 2) + 3 * Math.pow(r2, 2) + Math.pow(h, 2));
            // Resultados.
            System.out.println("El Area de la zona Esferica es: " + Az + " Unidades Cuadradas");
            System.out.println("El Volumen de la zona Esferica es: " + Vol + " Unidades Cubicas");

        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void AreaVolumen(double AreaC, double Ar, double Volc, double rad, double Rad, double v, double H) { // 7
        // double H;
        try {
            System.out.println("Digite el Radio Mayor(R)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite Radio Mayor(R) ");
                x.next();
            }
            Rad = x.nextDouble();
            while (Rad <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el Radio Mayor(R) de nuevo");
                Rad = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el Radio Menor(r)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite Radio Menor(r) ");
                x.next();
            }
            rad = x.nextDouble();
            while (rad <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el Radio Menor(r) de nuevo");
                rad = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite la altura(h)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite la altura(h) ");
                x.next();
            }
            H = x.nextDouble();
            while (H <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura(h) de nuevo");
                H = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // operaciones
            AreaC = 2 * PI * Rad * H; // En funcion del Radio de la esfera.
            Ar = PI * (Math.pow(rad, 2) + Math.pow(H, 2)); // En funcion del radio menor.
            Volc = PI * Math.pow(H, 2) * (3 * Rad - H) / 3; // En funcion del Radio de la esfera.
            v = PI * H / 6 * (3 * Math.pow(rad, 2) + Math.pow(H, 2)); // En funcion del radio menor.
            // Resultados
            System.out
                    .println("El Area del Casquete en funcion del Radio de la esfera es: " + AreaC
                            + " Unidades Cuadradas");
            System.out.println("El Area del Casquete en funcion del radio menor es: " + Ar + " Unidades Cuadradas");

            System.out
                    .println("El Volumen del Casquete en funcion del Radio de la esfera es: " + Volc
                            + " Unidades Cubicas");
            System.out.println("El Volumen del Casquete en funcion del radio menor es: " + v + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void AreaVolumen(double Radio, double Angulo, double AreA, double VOL) { // 4
        try {
            System.out.println("Digite el Radio Mayor(R)");
             while (!x.hasNextDouble()) {
                System.out.println("Digite el Radio Mayor(R) ");
                x.next();
            }
            Radio = x.nextDouble();
            while (Radio <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el Radio Mayor(h) de nuevo");
                Radio = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el angulo(Angulo)");
             while (!x.hasNextDouble()) {
                System.out.println("Digite  el angulo(Angulo) ");
                x.next();
            }
            Angulo = x.nextDouble();
            while (Angulo <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el angulo(Angulo) de nuevo");
                Angulo = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones
            AreA = PI * Math.pow(Radio, 2) * Angulo / 90; // Formula simplificada
            VOL = PI * Math.pow(Radio, 3) * Angulo / 270; // Formula Simplificada;
            // Resultados
            System.out.println("El Area del Huso Esferico es: " + AreA + " Unidades Cuadradas");
            System.out.println("El Volumen de la Cuña Esferica es: " + VOL + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void AreaVolumen(double a) { // 1
        double area, volumen, Altur;
        try {
            System.out.println("Digite el valor de a");
            while (!x.hasNextDouble()) {
                System.out.println("Digite  el valor de a ");
                x.next();
            }
            a = x.nextDouble();
            while (a <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de (a) de nuevo");
                a = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones
            area = Math.pow(a, 2) * Math.sqrt(3);
            volumen = Math.sqrt(2) / 12 * Math.pow(a, 3);
            Altur = a * Math.sqrt(6) / 3;
            // Resultados
            System.out.println("El Area del Tetraedro es: " + area + "Unidades Cuadradas");
            System.out.println("El Volumen del Tetraedro es: " + volumen + "Unidades Cubicas");
            System.out.println("La altura del Tetraedro es: " + Altur);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void AreaVolumen(double aRea, double Volumen) { // 2
        double Diagonal, A;
        try {
            System.out.println("Digite el valor de a");
             while (!x.hasNextDouble()) {
                System.out.println("Digite  el valor de a ");
                x.next();
            }
            A = x.nextDouble();
            while (A <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de (a) de nuevo");
                A = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones.
            aRea = 6 * Math.pow(A, 2);
            Volumen = Math.pow(A, 3);
            Diagonal = A * Math.sqrt(3);
            // Resultados
            System.out.println("El area del Hexaedro es: " + aRea + " Unidades Cuadradas");
            System.out.println("El Volumen del Hexaedro es: " + Volumen + " Unidades Cubicas");
            System.out.println("La Diagonal del Hexaedro es: " + Diagonal + " Unidades");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void AreaVolumen() { // 0
        double ARea, VOlumen, A;
        try {
            System.out.println("Digite el valor de a");
             while (!x.hasNextDouble()) {
                System.out.println("Digite  el valor de a ");
                x.next();
            }
            A = x.nextDouble();
            while (A <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de (a) de nuevo");
                A = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones
            ARea = 2 * Math.pow(A, 2) * Math.sqrt(3);
            VOlumen = Math.sqrt(2) / 3 * Math.pow(A, 3);
            // Resultados
            System.out.println("El area del Octaedro es:" + ARea + " Unidades Cuadradas");
            System.out.println("El Volumen del Octaedro es:" + VOlumen + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void calcularAreaVol(double Area, double volumen, double a) { // 3
        try {
            System.out.println("Digite el valor de la arista(a)");
             while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de la arista(a) ");
                x.next();
            }
            a = x.nextDouble();
            while (a <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de (a) de nuevo");
                a = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones
            Area = 3 * Math.pow(a, 2) * Math.sqrt(25 + 10 * Math.sqrt(5));
            volumen = (15 + 7 * Math.sqrt(5)) * Math.pow(a, 3) / 4;

            // Resultados
            System.out.println("El area es: " + Area + " Unidades Cuadradas");
            System.out.println("El Volumen es: " + volumen + " Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void calcularAreaVol(double AREa, double VOLumen) {
        double arista;
        try {
            System.out.println("Digite el valor de la arista(a)");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de la arista(a) ");
                x.next();
            }
            arista = x.nextDouble();
            while (arista <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de la arista(a) de nuevo");
                arista = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones
            AREa = 5 * Math.pow(arista, 2) * Math.sqrt(3);
            VOLumen = (3 + Math.sqrt(5)) * Math.pow(arista, 3) * 5 / 12;
            // Resultados
            System.out.println("El Area es: " + AREa + "Unidades Cuadradas");
            System.out.println("El Volumen es: " + VOLumen + "Unidades Cubicas");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static void ortoedro(double Area, double Vol, double Diagonal, double a, double b, double c) {
        try {
            System.out.println("Digite el valor de a");
              while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de a ");
                x.next();
            }
            a = x.nextDouble();
            while (a <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de (a) de nuevo");
                a = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor de b");
            while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de b ");
                x.next();
            }
            b = x.nextDouble();
            while (b <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de (b) de nuevo");
                b = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }

            System.out.println("Digite el valor de c");
             while (!x.hasNextDouble()) {
                System.out.println("Digite el valor de c ");
                x.next();
            }
            c = x.nextDouble();
            while (c <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite el valor de (c) de nuevo");
                c = x.nextDouble();
            }
            if (intentos == 3) {
                System.out.println("Ha intentado muchas veces, regresa mas tarde");
                return;
            }
            // Operaciones
            Area = 2 * (a * b + a * c + b * c);
            Vol = a * b * c;
            Diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
            // Resultados
            System.out.println("El area del Ortoedro es: " + Area + " Unidades Cuadradas");
            System.out.println("El volumen del Ortoedro es: " + Vol + " Unidades Cubicas");
            System.out.println("La diagonal del Ortoedro es: " + Diagonal + " Unidades");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }

    public static boolean Menu(int opcion) {
        boolean Retorno = true;
        switch (opcion) {
            case 1: {
                areasVolumenes(PI, PI, PI, PI, PI, intentos, PI); // 1 (1)
                break;
            }
            case 2: {
                areasVolumenes(PI, PI, PI, PI, intentos, PI); // 2(2)
                break;
            }
            case 3: {
                areasVolumenes(opcion, opcion, opcion, opcion, opcion, opcion, opcion, opcion); // 3 (3)
                break;
            }
            case 4: {
                areasVolumenes(opcion, opcion, opcion, opcion, opcion); // 4 (4)
                break;
            }
            case 5: {
                AreaVolumen(opcion, opcion, opcion); // 5 (1)
                break;
            }
            case 6: {
                AreaVolumen(opcion, opcion, opcion, opcion, opcion, opcion); // 6(2)
                break;
            }
            case 7: {
                AreaVolumen(opcion, opcion, opcion, opcion, opcion, opcion, opcion); // 7(3)
                break;
            }
            case 8: {
                AreaVolumen(opcion, opcion, opcion, opcion); // 8(4)
                break;
            }
            case 9: {
                ortoedro(opcion, opcion, opcion, opcion, opcion, opcion);
                break;
            }
            case 10: {
                AreaVolumen(opcion); // 10 (5)
                break;
            }
            case 11: {
                AreaVolumen(opcion, opcion); // 11 (6)
                break;
            }
            case 12: {
                AreaVolumen(); // 12 (7)
                break;
            }
            case 13: {
                calcularAreaVol(opcion, opcion, opcion); // 13 (1)
                break;
            }
            case 14: {
                calcularAreaVol(opcion, opcion); // 14 (2)
                break;
            }
            case 15: {
                areasVolumenes(opcion, opcion, opcion, opcion, opcion, opcion, opcion, opcion, opcion); // 15 (5)
                break;
            }
            case 16: {
                areasVolumenes(opcion, opcion, opcion, opcion, opcion, opcion, opcion, opcion, opcion, opcion, opcion); // 16(6)
                break;
            }
            case 17: {
                Retorno = false;
                System.out.println("Muchas Gracias por usar el programa");
                break;
            }

        }
        return Retorno;
    }

    public static void main(String[] args) {
        boolean R = true;
        int operacion;
        try {
            while (R) {
                System.out.println(
                        "1.Prisma 2.-Cilindro 3.-Piramide 4.-Cono 5.-Esfera 6.-Zona esférica 7.-Casquete esférico 8.- Huso esférico y cuña esférica 9.- Ortoedro 10.- Tetraedro 11.- Hexaedro 12.- Octaedro 13.- Dodecaedro 14.- Icosaedro 15.-Tronco de Cono 16.-Tronco de pirámide 17.-Salir");
                System.out.println("Seleccione su opcion");
                while (!x.hasNextInt()) {
                    System.out.println("Seleccione su opcion: ");
                    x.next();
                }
                operacion = x.nextInt();
                R = Menu(operacion);
            }

        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingrese un valor valido");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Entrada no valida");
        }

    }
}
