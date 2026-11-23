
# Lesson 6: Polymorphism and Abstraction

## Introduction

Kini nga activity nagpakita sa duha ka importante nga concepts sa Object-Oriented Programming (OOP), ang Polymorphism ug Abstraction.

Naghimo ko og duha ka Java programs nga nagpakita kung unsaon paggamit niini sa mga real-world examples.

## Part 1: Polymorphism

Ang PolymorphismDemo.java nagpakita sa usa ka payment system. Adunay lain-laing paagi sa pagbayad sama sa Cash ug GCash.

### How Polymorphism Works in My Code

Sa akong program, ang parent class mao ang `Payment`. Aduna kini duha ka child classes nga `CashPayment` ug `GCashPayment`.

Ang duha ka child classes naggamit sa `extends` aron makapanunod gikan sa parent class.

Ang overridden method mao ang `makePayment()`. Gigamit ang `@Override` aron ang matag child class adunay kaugalingong implementation sa maong method.

Kung tawagon ang `makePayment()`, lahi ang output depende kung CashPayment ba o GCashPayment ang object.

Kini nagpakita nga parehas ang method nga gigamit apan lahi ang resulta.

## Part 2: Abstraction

Ang AbstractionDemo.java nagpakita sa mga hayop nga adunay lain-laing tingog.

### How Abstraction Works in My Code

Sa akong program, ang abstract class mao ang `Animal`.

Aduna kini abstract method nga `makeSound()` ug regular method nga `sleep()`.

Ang duha ka child classes mao ang `Dog` ug `Cat`.

Ang Dog class nag-implement sa `makeSound()` pinaagi sa pagpakita sa tingog sa iro. Ang Cat class usab adunay kaugalingong implementation pinaagi sa pagpakita sa tingog sa iring.

Ang regular method nga `sleep()` magamit sa duha ka child classes bisan wala nila kini gi-override.

Dili makahimo og direct object gikan sa abstract class nga Animal. Kinahanglan mogamit og child class sama sa Dog ug Cat.

## Difference Between Polymorphism and Abstraction

Ang Polymorphism nagpakita kung giunsa sa usa ka method nga adunay lain-laing behavior depende sa object nga naggamit niini.

Ang Abstraction nagpakita kung giunsa pagtago ang mga detalye sa implementation ug paghatag lamang sa importanteng structure o behavior nga kinahanglan sundon sa child classes.

Sa simple nga pagsabot, ang Polymorphism nag-focus sa lain-laing behavior, samtang ang Abstraction nag-focus sa pagtago sa unnecessary details.

## Reflection Questions

### 1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Importante ang method overriding kay pinaagi niini makahatag ang child class og kaugalingong behavior sa method nga napanunod gikan sa parent class. Kung dili i-override sa child class ang method, gamiton niini ang original method sa parent class. Kung abstract ang method, kinahanglan kini i-implement sa concrete child class aron mahimong kompleto ang class.

### 2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

Dili ta makahimo og direct object gikan sa abstract class kay dili pa kompleto ang implementation niini. Adunay mga methods nga wala pa'y sulod o wala pa'y actual nga instructions. Ang purpose niini mao ang pagsiguro nga ang mga child classes maoy mohatag sa ilang kaugalingong implementation sa abstract methods.

### 3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

Kung magdugang ko og laing child class sama sa CardPayment, pwede ra kini mo-extend sa Payment class ug maghimo og kaugalingong makePayment() method. Mahimo usab nako kini gamiton pinaagi sa parent-class reference. Dili kinahanglan usbon ang existing child classes.

### 4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Oo, mahimong magamit ang Polymorphism ug Abstraction sa usa ka program. Pananglitan, adunay abstract class nga Animal nga adunay abstract method nga makeSound(). Ang Dog ug Cat mahimong child classes nga mag-implement sa maong method. Dayon mahimo natong gamiton ang Animal reference aron motawag sa makeSound() sa lain-laing animal objects. Kini nagpakita sa Abstraction ug Polymorphism sa usa ka program.

### 5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

Gamiton nako ang Polymorphism kung gusto nako nga ang lain-laing objects mogamit sa parehas nga method pero adunay lain-laing resulta. Gamiton nako ang Abstraction kung gusto nako nga maghimo og general structure nga sundon sa mga child classes ug dili ipakita ang tanang detalye sa implementation. Importante silang duha aron mas organisado ug sayon i-maintain ang akong programs.

## Conclusion

Pinaagi niini nga activity, mas nasabtan nako ang paggamit sa Polymorphism ug Abstraction sa Java. Nakat-on ko nga ang Polymorphism makatabang sa paghimo og lain-laing behavior gamit ang parehas nga method, samtang ang Abstraction makatabang sa paghimo og general structure nga mahimong sundon sa mga child classes.

Importante kini nga mga concepts aron makahimo ko og mas organisado, flexible, ug masabtan nga programs isip future programmer.
