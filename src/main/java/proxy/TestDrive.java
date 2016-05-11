package proxy;

import java.lang.reflect.Proxy;

/**
 * Created by lx on 16/5/11.
 */
public class TestDrive {

    public static void main(String[] args) {
        TestDrive test = new TestDrive();
        test.drive();
    }

    public TestDrive() {
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl("jason");
        PersonBean ownerProxy = getOwnerProxy(joe);

        System.out.println("name is " + ownerProxy.getName());

        ownerProxy.setName("Jason");
        System.out.println("name is " + ownerProxy.getName());

        ownerProxy.setHotOrNotRating(8);
        System.out.println(ownerProxy.getHotOrNotRating());

    }

    /**
     * 动态代理，在运行时才创建
     * @param person
     * @return
     */
    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInocationHanler(person));
    }
}
