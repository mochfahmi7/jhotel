package jhotel;

/**
 * Ini merupakan class Enum untuk TipeKamar.Class ini akan membatasi tipe kamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public enum TipeKamar
{
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    private final String toString;
    
    TipeKamar(String toString)
    {
        this.toString=toString;
    }
    
    public String toString()
    {
        return this.toString;
    }

}
