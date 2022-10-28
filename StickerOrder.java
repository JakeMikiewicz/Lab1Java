// Lab 1
// Jake Mikiewicz
// October 28, 2022

class StickerObserver{
    public StickerObserver(self, subject){
        self.subject = subject;
        subject.add_observer(self);
    }

    public update(self, order){
       print("Your order for {0} stickers has been placed!".format(order.quantity));
    }
}

class StickerDecorator{
    public StickerDecorator(self, subject){
        self.subject = subject;
        subject.add_decorator(self);
    }
 

    public decorate(order) {
       print("Your order for {0} stickers has been decorated!".format(order.quantity));
    }
}

class StickerOrder{
    int observer;

    public StickerOrder(self, quantity){
        self.quantity = quantity;
        self.observers = "";
        self.decorators = "";
    }

    public add_observer(self, observer){
       self.observers.append(observer);
    }

 

    public add_decorator(self, decorator){

       self.decorators.append(decorator);
    }

 

    public place(){
        for (observer : self.observers){
           observer.update(self);
        }

        for (decorator : self.decorators){
           decorator.decorate(self);
        }
    }

    public void main(String args[])
        System.out.print("Ordering five stickers this moment...");
        order = StickerOrder(5);
        int observer = StickerObserver();
        decorator = StickerDecorator();
        order.place();
    }
}