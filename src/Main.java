public class Main {
    public static void main(String[] args) {
        int counts = 0;
        try {

            /*3 задача*/
            Box box = new Box(150);
            Pyramid p = new Pyramid(15,15);
            Ball b=new Ball(2.0);
            Cylinder c = new Cylinder(4,2.4);

            System.out.println(box.add(p));
            System.out.println(box.add(b));
            System.out.println(box.add(c));


        } catch (OutOfMemoryError e) {
            System.out.println("память закончилась, количество созданных записей " + counts);
        }


    }

    public void randomNum()
    {
        /**
         * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
         * Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
         */

        float min = 1.0f;
        float max = 0.0f;
        float sum = 0.0f;
        var myArray = new float [10];
        for(int i=0; i<myArray.length;i++)
        {
            myArray[i]= (float) Math.random();
            sum+=myArray[i];

            if(myArray[i]<min)
            {
                min=myArray[i];
            }
            if(myArray[i]>max)
            {
                max=myArray[i];
            }
        }
        sum=sum/myArray.length;

        System.out.println("Максимальное значение: "+max);
        System.out.println("Минимальное значение: "+min);
        System.out.println("Среднее значение: "+sum);
    }
    public void primeNumber()
    {
        /**
         *Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
         * Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
         */


        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; j++) {
                if (i % j == 0) count++;
            }
            if (count < 2) System.out.println(i);
        }
    }
}