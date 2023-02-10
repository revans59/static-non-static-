import javax.swing.text.PlainDocument;

class WhatsappUpates
{
static long countMessages = 1323L;
static float whatsappVersion = 3.2f; 
String myStatus = "Hi there, I am using whatsapp";
void createNewGrp()
{
System.out.println("New grp created..!!");
}

static void countMessageOfGrp()
{
    countMessages = 3432423L;
    System.out.println("currentMsgCount "+countMessages);
}

}



class MainClass
{

    static String name = "Revan siddu";

    static void loginWhatsapp()
    {
        System.out.println("Logged in successfully");
    }

    public static void main(String[] args) {

            System.out.println("Name "+name);
            loginWhatsapp();

            System.out.println("msg count: "+WhatsappUpates.countMessages);
            System.out.println("Whatsapp version: "+WhatsappUpates.whatsappVersion);

            new WhatsappUpates().createNewGrp();
            WhatsappUpates.countMessageOfGrp();

    }
}