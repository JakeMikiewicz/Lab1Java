// Lab 1
// Jake Mikiewicz
// October 28, 2022

class StickerObserver{
    def __init__(self, subject){
        self.subject = subject;
        subject.add_observer(self);
    }

    def update(self, order){
       print("Your order for {0} stickers has been placed!".format(order.quantity));
    }
}

class StickerDecorator{

    def __init__(self, subject){
        self.subject = subject;
        subject.add_decorator(self);
    }
 

    def decorate(order) {
       print("Your order for {0} stickers has been decorated!".format(order.quantity));
    }
}

class StickerOrder{
    int observer;

    def __init__(self, quantity){
        self.quantity = quantity;
        self.observers = "";
        self.decorators = "";
    }

    def add_observer(self, observer){
       self.observers.append(observer);
    }

 

    def add_decorator(self, decorator){

       self.decorators.append(decorator);
    }

 

    def place(){
        for observer in self.observers{
           observer.update(self);
        }

        for decorator in self.decorators{
           decorator.decorate(self);
        }
    }

    if (__name__ == "__main__") {
        System.out.println("Ordering five stickers this moment...");
        order = StickerOrder(5);
        observer = StickerObserver(order);
        decorator = StickerDecorator(order);
        order.place();
    }
}