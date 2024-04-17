public class Personagem2 {
    String formato;
    int posX, posY;

    Personagem2(int posX, int posY, String formato)
    {
        this.posX = posX;
        this.posY = posY;
        this.formato = formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    public void setPosX(int posX)
    {
        this.posX = posX;
    }
    public void setPosY(int posY)
    {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }
    public String getFormato()
    {
        return formato;
    }
    public int getPosY()
    {
        return posY;
    }
}
