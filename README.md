VIRTUAL PET APP

Main
requires three attributes and three methods create a tick() method to indicate time passing
create a Main method using Scanner input and console output

extra tasks
give the ability for the pet to take care of some of it's own needs
create a virtual representation of your pet

Tick
add to my attributes,(hungry,thirsty,sleepy,bored, and poop), with ever iteration.  I added a speed variable that I input from the 
scanner to obtain the amount that gets added to the attributes with every tick.  This allows me to compress testing over multiple
days pretty quickly.  I included a check for the attributes if they go over 100 I print a message that the pet died or ran away.
Tick will automatically start the poop and sleep methods once the attributes hit a certain level.  I also made it so once an 
attribute reaches a warning level I call the talk method to notify the operator that they need to deal with their pet.  At the end
of each tick, I print the status of all the attributes.

Feed
I made the feed method subtract 40 from the hungry attribute and then add 2 to thirsty and sleepy while taking 5 off of bored.  I 
add 20 to poop each time you feed.

water
I subtract 40 from the thirsty attribute each time you water.

sleep
sleep is started by the tick method when the sleepy attribute goes over 80.  But when your pet is asleep you can't feed it, or
water it, or play with it until it wakes up.  So I set a sleeptimer variable that gets decreased by the value of speed in each tick
until the value <=0.  Any attempt to feed, water, or play with the pet will get you a warning, "Don't bother me I'm sleeping!"
Each time sleep starts it resets the sleepy attribute to 0.

play
This deducts 40 from the bored attribute each time if the pet is not asleep, but it also makes hungry, thirsty, and sleepy go up 
by 5.

poop
This gets called automatically once the poop attribute gets above 60.  It will deduct 40 from poop and add 10 to the dirty 
attribute.

clean
Clean can be done anytime even if the pet is sleeping.  It resets the dirty attribute to 0.


Test