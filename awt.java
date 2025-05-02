import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

 class Reflection {

    public static void main(String[] args) {
        try{
            Class c=Class.forName("java.awt.image.DataBufferDouble");
            System.out.println("constructores: ");
            Constructor constructor[]=c.getConstructors();
            for(int i=0;i<constructor.length;i++){
                System.out.println(" "+constructor);
            }
            System.out.println("Fields: ");
            Field fields[]=c.getFields();
            for(int i=0;i<fields.length;i++){
                System.out.println(" "+fields);
            }
            System.out.println("Method: ");
            Method method[]=c.getMethods();
            for(int i=0;i< method.length;i++){
                System.out.println(" "+method);

            }
        }
        catch (Exception e){
            System.out.println("Excepton e:"  +e);

        }
    }

}
