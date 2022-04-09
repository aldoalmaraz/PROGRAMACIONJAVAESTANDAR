public class UpdateVariables {
    public static void main(String[] args) {
        int salary=1000;
        //bono $200
        salary=salary+200;
        System.out.println(salary);
    // pension: 50 descuento
        salary=salary-50;
        System.out.println(salary);

        // 2 horas extra 30 cada una
        // utilizo cupon comida :45

        salary=salary+ (30*2) - 45;
        System.out.println(salary);
    // actualizando cadenas de texto
        String employeeName="Aldo Almaraz";
        employeeName= employeeName + " Mesta";
        System.out.println(employeeName);
   employeeName= "Irene "+ employeeName;
        System.out.println(employeeName);
        System.out.println("Tu nombre es: "+ employeeName);
    }
}
