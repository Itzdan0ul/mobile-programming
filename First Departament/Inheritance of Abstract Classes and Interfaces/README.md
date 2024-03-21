# Activity. Inheritance of Abstract Classes and Interfaces

### Instructions

From the Travel booking system project (`class Travel`) perform the following points:

1. Create the International class for international travel, contemplate that now the user provides the name of the Country and the City.
2. There is a member in the Travel Class that although it is abstract, it could be identical in both National and International. In case of affirmation, add the body in the abstract class and remove it from its children.
3. We must set the taxes per country, and the cities to travel to:

    - Germany has 16% of the total price as tax and the cities available are:
        - Munich, $980 per day
        - Berlin, $820 per day
        - Frankfurt, $850 per day

    - Chile charges only 5% as tax and its cities are:
        - Santiago, $643 per day
        - Valparaíso, $721 per day

    - Canada charges 10% tax and the cities to visit are:
        - Vancouver, $620 per day
        - Ottawa, $680 per day
        - Montreal, $600 per day

4. Redefine the `getPrice()` function to get the price of a trip including tax.
5. Create an interface that allows to cancel trips. Implement it in the `NationalLowSeason` class.