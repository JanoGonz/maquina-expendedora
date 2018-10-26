public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple() {
       precioBillete = 12;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = "Dubai";
    }
    
    public MaquinaExpendedoraSimple(int costeBillete, String lugarDestino) {
       precioBillete = costeBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = lugarDestino;
    }
    
    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }

    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }

    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        if (cantidadIntroducida < 0) {
            System.out.println("No puedes introducir una cantidad de dinero negativa");
        } else {
            balanceClienteActual = balanceClienteActual + cantidadIntroducida;
            System.out.println("Gracias por su dinero, su saldo es " + balanceClienteActual);
        }
    }

    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        if (balanceClienteActual > 30) {
            System.out.println("##################");
            System.out.println("# Billete de tren:");
            System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
            System.out.println("# " + precioBillete + " euros.");
            System.out.println("Su cambio es " + (balanceClienteActual - precioBillete) + " euros.");
            System.out.println("##################");
            // Actualiza el total de dinero acumulado en la maquina
            totalDineroAcumulado = totalDineroAcumulado + precioBillete;
            // Queda preparada para el proximo cliente
            balanceClienteActual = 0;
        } else {
            System.out.println("No tienes suficiente dinero");
        }
    }
    
    public int getDineroAcumu() {
        return totalDineroAcumulado;
    }
    
    public void cambiarPrecioBillete(int nuevoPrecio) {
        precioBillete = nuevoPrecio;
        System.out.println("El nuevo precio es " + precioBillete + " euros.");
    }
    
    public void reducirPrecioBillete(int reducirPrecio) {
        if (reducirPrecio<0){
            reducirPrecio = reducirPrecio*-1;
        }
        precioBillete -= reducirPrecio;
        System.out.println("El nuevo precio es " + precioBillete + " euros.");
    }
}
