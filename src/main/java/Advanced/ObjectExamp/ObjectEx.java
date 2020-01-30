package Advanced.ObjectExamp;

public class ObjectEx {


    /**  HASHCODE EQUALS
     *
     * 1)При проверке объектов сначала вызываем метод  HASHCODE() ,  если значения хеша разные, то эти объекты точно разные
     * 2) Если хеши одинаковые, то вызываем метод EQUALS()
     * 3)EQUALS выдаст точный ответ, разные они или нет.
     *
     * Для уточнения равности объектов используется оба метода так как  метод Equals требует много времени для получения ответа ( т.к. ему приходится
     * сравнивать все поля объекта, которые могут быть произвольных размеров ( и разной  длины)).  А  вычисление  хеша ( числовое представление объекта) с помощью хеш-функции занимает меньше времени
     * так как хеш является фиксированным размером  в отличии от обычного своего представления.
     *
     * */



    public static void main(String[] args) throws CloneNotSupportedException {




        final User user= new User();

        user.setSubuser(new User());

        user.getSubuser().setName("just name of subuser");

        System.out.println(user.getSubuser().getName());


        /**user.getClass();  -  getClass  позволяет получить класс объектом которого этот класс является. */

        final User clone= user.clone();

        System.out.println("after clone");

        clone.getSubuser().setName("SubUser name is  CloneSub");

        System.out.println(user.getSubuser().getName());



        System.out.println("\n"+user.a==user.b);

        user.a=user.b;

        System.out.println(user.a==user.b);

        /** Equals - используется для сравнения объектов :
         * 1)Вы сами выбираете критерии для сравнения (любые поля объекта)
         * 2)Если не переопределять метод  Equals , то все  создаваемые объекты будут выдавать false
         * 3)Ссылочные переменные сравниваются через Equals()
         * 4)Если объект используется  в коллекции, то его обязательно нужно переопределять.
         * */

        /** user.hashCode();    -
         * 1) это число, которое у двух эквивалентных объектов всегда одинаковое
         * 2) может быть одинаковым для не эквивалентных объектов
         * 3)не меняется по ходву программы
         * 4)используется для быстрого поиска
         * 5) Числовое представление объекта (результат выполнения хеш функции)
         * 6)Hash-code и Equals переопределяются  одновременно
         * 7)Если два объекта равны по equals, то хешкод тоже должны быть равен для двух объектов.
         * 8)Разные объекты могу возрвщать одинаковый хеш-код, это коллизия.
         * 9)  Если  в  Equals  мы используем определенное поле, то это же поле нужно использовать  в hashcode,
         * чтобы исходные данные по которым будут вычисляться значения были одинаковые.
         *
         * */

        /**user.clone() - с помощью этого метода можно создать копию объекта.
         * 1) Чтобы  метод работал нужно переопределить  этот метод , чтобы сделать его public
         * 2) Так же нужно , чтобы клонируемый класс реализовывал интерфейс cloneable*/

        /**   user.finalize       - Предназначен этот метод для автоматического освобождения системных ресурсов, занимаемых объектом,
         *  на котором будет данный метод вызван.
         *  Это кажется удобным, чтобы не помнить постоянно, например, что мы должны закрыть соединение с каким-то ресурсом, когда оно больше не требуется.

         Не стоит полагаться на finalize для чистки данных. Во-первых, нет гарантии,
         что он будет вызван, т.к. где-то может остаться ссылка на объект.
         Во-вторых, нет гарантии на то, в какое время будет вызван метод.
         Это связано с тем, что после того, как объект становится доступным
         для сборки и, если в нем переопределен метод finalize, то он не вызывается
         сразу, а помещается в очередь, которая обрабатывается специально созданным
         для этого потоком. Стоит отметить, что в очередь на финализацию попадают только
         те объекты, в которых переопределен метод finalize.
         Есть вероятность, что этот метод не будет вызван совсем. Это может произойти в момент,
         когда объект уже станет доступным для сборщика мусора и программа завершит свою работу.   */
    }
}

class User implements Cloneable{
    String a="abc";
    String b="abc";

    private String name;
    private String SurName;

    private User subuser;

    public User getSubuser() {
        return subuser;
    }

    public void setSubuser(User subuser) {
        this.subuser = subuser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return SurName != null ? SurName.equals(user.SurName) : user.SurName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (SurName != null ? SurName.hashCode() : 0);
        return result;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}