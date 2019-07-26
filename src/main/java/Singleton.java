/**
 * @author 黄豪强
 * @create 2019/7/26 10:00
 */
public class Singleton  {
      private int i=0;
      private  static   class LazyHolder {
          private static final Singleton INSTANCE=new Singleton();
      }
      private Singleton()
      {
                i++;
                System.out.println(i);
      }
      public static  final  Singleton getInstance()
      {
          return  LazyHolder.INSTANCE;
      }

}
