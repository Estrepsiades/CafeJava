public class Maquina {
    int water = 5000;
    int coffe = 1000;
    int cream = 1500;
    int coup = 50;

    private String sendMessage( String msg ){
        return msg;
    }
    public int getWater() {
        return water;
    }

    public int getCoffe() {
        return coffe;
    }

    public int getCream() {
        return cream;
    }

    public int getCoup() {
        return coup;
    }
    private boolean checkCoup(){
        if ( coup >= 1 ) {
            return true;
        }
        return false;
    }
    private boolean checkWater( int waterNeed ){
        if ( water >= waterNeed ){
            return true;
        }
        return false;
    }
    private boolean checkCoffe( int coffeNeed ){
        if ( coffe >= coffeNeed ){
            return true;
        }
        return false;
    }
    private boolean checkCream( int creamNeed ){
        if ( cream >= creamNeed ){
            return true;
        }
        return false;
    }
    public String makeAmerican(){
        if ( !this.checkCoup() ){
            return this.sendMessage("No hay vasos ");
        }
        if ( !this.checkWater(180 ) ){
            return this.sendMessage("No hay agua suficiente ");
        }
        if ( !this.checkCoffe( 15 ) ){
            return this.sendMessage("No hay cafe suficiente ");
        }
            this.water = this.water - 180;
            this.coffe = this.coffe - 15;
            this.coup = this.coup - 1;
            return this.sendMessage("Sirviendo Americano :)");
    }
    public String makeExpresso(){
        if ( !this.checkCoup() ){
            return this.sendMessage("No hay vasos ");
        }
        if ( !this.checkWater(120 ) ){
            return this.sendMessage("No hay agua suficiente ");
        }
        if ( !this.checkCoffe( 20 ) ){
            return this.sendMessage("No hay cafe suficiente ");
        }
        this.water = this.water - 120;
        this.coffe = this.coffe - 20;
        this.coup = this.coup - 1;
        return this.sendMessage("Sirviendo Expresso :)");
    }
    public String makeCapuchino(){
        if ( !this.checkCoup() ){
            return this.sendMessage("No hay vasos ");
        }
        if ( !this.checkWater(120 ) ){
            return this.sendMessage("No hay agua suficiente ");
        }
        if ( !this.checkCoffe( 20 ) ){
            return this.sendMessage("No hay cafe suficiente ");
        }
        if ( !this.checkCream( 70 ) ){
            return this.sendMessage("No hay crema suficiente ");
        }
            this.water = this.water - 100;
            this.cream = this.cream - 70;
            this.coffe = this.coffe - 14;
            this.coup = this.coup - 1;
            return this.sendMessage("Sirviendo Capuchino :) ");
    }
}
