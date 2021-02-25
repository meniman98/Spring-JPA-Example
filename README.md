# Spring-JPA-Example

## Hello and Welcome
How nice of you to stop by. This Java application is a quick example of how JPA works. I shall explain how

Suppose you required an easy database to work with in Spring. The JPA is a fantastic solution. It can store entities and find them very easily. This is how

1. Firstly create a POJO (plain old java object) so something like car, house, customer, cat
2. Make a repository of your POJO, so CarRepository. Your repository is an interface which extends from CrudRepository, which inherits very useful methods to use.
3. Within the repository create your function queries. So something like findByID() or findAll() or findByBrand() the sweet thing here is that you do not need to
implement those function bodies. JPA does it for you. That's super sweet.
4. Navigate to your main class and create a car instance and test out all the sweet query functions you've created! Watch how smoothly they will work
