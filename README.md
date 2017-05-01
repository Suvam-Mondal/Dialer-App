# Dialer-App
1.Can make phone calls.</br> 2.Can run USSD codes. 

## Steps Followed
* 12 buttons(0-9,*,#) are used for taking the input number and the input is reflected through an EditView.

* A button for making the call and another button for deleting the number in the current position is used.

* For calling, the app first checks whether the number is valid ( 10 digits), then it makes the call by clicking the call button. (The call is made using ACTION_CALL intent)

* For running USSD codes, the app checks whether the given code starts with "*" and ends with "#". Then the apps uses ACTION_CALL intent to run the USSD code.

* To edit the number at any position, the user selects the position by clicking on the EditView, the app fetches the position of the cursor. Then the user can either add numbers or delete the number to the immediate left of the cursor.

* To clear the whole input ( Delete the whole number ) , long press the delete button.


## Screenshots
<img src = "https://github.com/Suvam-Mondal/Dialer-App/blob/master/PicsArt_05-01-01.57.38.jpg" height="480" width="320" >

<img src = "https://github.com/Suvam-Mondal/Dialer-App/blob/master/Screenshot_20170501-075821.png" height="480" width="320" >
