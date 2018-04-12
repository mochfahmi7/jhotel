import java.util.ArrayList;

/**
 * Ini class DatabaseRoom.
 *
 * @author Mochamad Fahmi Fajrin 
 * @version 10/03/2018
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    public static boolean addRoom(Room baru)
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(!kamar.getHotel().equals(baru.getHotel()) &&
                    !kamar.getNomorKamar().equals(baru.getNomorKamar()))
            {
                ROOM_DATABASE.add(baru);
                return true;
            }
        }

        return false;
    }

    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) &&
                    kamar.getNomorKamar().equals(nomor_kamar))
            {
                return kamar;
            }
        }

        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel))
            {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;
    }

    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT))
            {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;
    }



    public static boolean removeRoom(int id)
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel(hotel).equals() &&
                    kamar.getNomorKamar().equals(nomor_kamar))
            {
                Administrasi.pesananDibatalkan(kamar);
                if(ROOM_DATABASE.remove(kamar))
                {
                    return true;
                }
            }
        }
        return false;
    }
    


}