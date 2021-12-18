package vn.techmaster;

public class Repository {
    public static ServiceEmployee<Waiter> addWaiter() {
        ServiceEmployee<Waiter> listWaiter = new ServiceEmployee<>();
        listWaiter.add(new Waiter(1, "Đạt", 22, 7000000, Type.Waiter, 2100000));
        listWaiter.add(new Waiter(2, "Kiên", 28, 5000000, Type.Waiter, 1200000));
        listWaiter.add(new Waiter(3, "Hoàng", 27, 6000000, Type.Waiter,1200000));
        return listWaiter;
    }

    public static ServiceEmployee<Kitchen> addKitchen() {
        ServiceEmployee<Kitchen> listKitchen = new ServiceEmployee<>();
        listKitchen.add(new Kitchen(1, "Ngọc", 22, 11000000, Type.Kitchen, 4100000));
        listKitchen.add(new Kitchen(2, "Hoa", 38, 9000000, Type.Kitchen, 3000000));
        listKitchen.add(new Kitchen(3, "Minh", 30, 10000000, Type.Kitchen, 3500000));
        return listKitchen;
    }
}
