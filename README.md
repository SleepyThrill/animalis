# animalis

A top tier project that involves a LOAD of stuff. This includes:
- cats
- dogs
- ye
..well.


## What I understood from every part I coded:
The main thing I understood was how "extends", "super" and "enums" work.

- Enums are basically like adding a new form of variable type, as if they were either "String" or "Boolean", but in this case it was like "Domestic" or "Urban". What I got from that is that you can basically turn those arrays inside each enum file into some sort of attribute for the animal, where you limit the user to choosing between the options that are available.


- Super is like, for example, in here:
```java
  super(name, 30, age, weight, isIndoor ? Habitat.DOMESTIC : Habitat.URBAN, false);
```
The "super" in the subclass Cat basically takes the attributes from the abstract class Animal as if it were typing allat "this.name = name" shtuff again, but not actually initializing them again? I guess that's what it is..


- Extends are basically just subclasses that take stuff from the "superclass" (I guess that's what it's called?) that's already written and add more stuff to them.


## Decision-making
- I had to assign a value to "speed", since the field wasn't visible, which I guess it shouldn't be and 30 should be the default unless the user wants to change it? No clue.
- I had to change a few things from the original displayInfo() method, since it wasn't organized like it originally was, and was planning on putting an additional like break so that the abstract class' information and the concrete class' information are separate, but nah..


## How I tested it
Just check Main.java..
It's self-explanatory..
