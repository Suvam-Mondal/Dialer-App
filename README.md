# Dialer
1.Can make phone calls.</br> 2.Can run USSD codes.</br> 3. Contact list so that the user do not have to type the number before calling. 

## Steps Followed
* 12 buttons(0-9,*,#) are used for taking the input number and the input is reflected through an EditView.

* A Floating button is used to hide/unhide the dial pad as required by the user. On clicking the floating button once, the dial pad shows up. If the user again clicks the floating button, the dial pad disappears from the screen.

* A button for making the call and another button for deleting the number in the current position is used. Long pressing the delete button clears the entire dialing number area and long pressing '0' adds '+' to the dialing number area at the current position.

* The app access the Phone Contacts and fetches the contact name and number for each person in the phone's contact list. Then the contact name and number is stored in a Hash Map , the name being the key and the number being the value. A Listview and an Adapter is used to display the contact name along with the contact number for that person. The Adapter fetches the contact name and number from the Hash Map and displays them on the Listview.

* For calling, the user can either type in the number or can just select a contact from the displayed contact list.On selecting a contact from the list, the contact number for that name is copied to the dialing number area. On clicking the call button, the app checks whether the number is valid ( 10 digits). If valid, it makes the call. (The call is made using ACTION_CALL intent)

* For running USSD codes, the app checks whether the given code starts with "*" and ends with "#". Then the apps uses ACTION_CALL intent to run the USSD code.

* To edit the number at any position, the user selects the position by clicking on the EditView, the app fetches the position of the cursor. Then the user can either add numbers or delete the number to the immediate left of the cursor.

* To clear the whole input ( Delete the whole number ) , long press the delete button.


## Screenshots
<img src = "https://github.com/Suvam-Mondal/Dialer-App/blob/master/PicsArt_05-11-08.03.25.jpg" height="480" width="320" >

<img src = "https://github.com/Suvam-Mondal/Dialer-App/blob/master/PicsArt_05-11-07.52.26.jpg" height="480" width="320" >



