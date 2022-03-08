package com.ugisozols.shoppinglistapp.presentation.shopping_list

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.preferences.Preferences
import com.ugisozols.shoppinglistapp.utils.Resource
import com.ugisozols.shoppinglistapp.utils.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

/**
 * [ShoppingScreenViewModel] contains states and state change functions
 * as well as functions that manipulates with data from call
 */
@HiltViewModel
class ShoppingScreenViewModel @Inject constructor(
    private val preferences: Preferences
) : ViewModel() {


    var userName by mutableStateOf("")
        private set
    /**
     *  function sets [userName] string that is returned form [Preferences.loadUserName]
     *  function
     */
    private fun setUsername() {
        userName = preferences.loadUserName().name
    }

    var isCategoryListExpanded by mutableStateOf(false)
        private set

    var isExpanded by mutableStateOf(false)


    /**
     * sets [isCategoryListExpanded] value to opposite of current value
     * used to observe the state of category list if it's expanded or not
     */
    fun onCategoryListExpanded() {
        isCategoryListExpanded = !isCategoryListExpanded
    }

    var showDialog by mutableStateOf(false)
        private set
    /**
     *  sets [onShowDialog] value to opposite of current value
     *  used to observe the state of dialog if it's shown or not
     */
    fun onShowDialog() {
        showDialog = !showDialog
    }

    var chosenCategoryName = mutableStateOf("")
        private set

    /**
     * sets [chosenCategoryName] to selected categories name
     * used to display currently selected category
     *
     * @param categoryName is type of [String] value of selected [Category]
     */

    fun onSelectCategory(categoryName: String) {
        chosenCategoryName.value = categoryName
    }

    var name = mutableStateOf("")
        private set

    /**
     * sets [name] value to input name value from Add new product alert dialog
     * @param newName of type [String] passed form input field
     */
    fun onAddName(newName: String) {
        name.value = newName
    }

    var amount = mutableStateOf("")
        private set
    /**
     * sets [amount] value to input amount value from Add new product alert dialog
     * @param newAmount of type [String] passed form input field
     */
    fun onAddAmount(newAmount: String) {
        amount.value = newAmount
    }

    /**
     * [currentCategory] is used in function to receive data for specific category defined in this
     * state
     */
    var currentCategory = mutableStateOf(Category.fromString("general"))
        private set

    /**
     * function takes category that is selected in UI and passes the [Category] data to
     * [currentCategory] state
     * @param category of Type [Category] gets specified in UI
     */
    fun setCurrentCategory(category: Category) {
        currentCategory.value = category
    }

    /**
     * [listOfCheckedProducts] list contains checked products in UI
     * used to collect products then this list gets passed to delete function
     * that deletes current product from cloud
     */
    private val listOfCheckedProducts = mutableStateOf<MutableList<Product>>(mutableListOf())

    /**
     * adds products to [listOfCheckedProducts]
     * @param product of Type [Product]
     */
    fun onAddToList(product: Product){
        listOfCheckedProducts.value.add(product)
    }
    /**
     * removes products from [listOfCheckedProducts]
     * @param product of Type [Product]
     */
    fun onRemoveFromList(product: Product){
        listOfCheckedProducts.value.remove(product)
    }
    /**
     * Mutable value of [productState] this gets its values from successful api response
     * This value can only be modified within viewModel because it's not correct
     * to be able to access this mutable state outside viewModel
     */
    private val _productListState = mutableStateOf<Resource<List<Product>>>(Resource.Loading())


    /**
     * Immutable value of [_productListState] to access this in UI
     */
    val productState: State<Resource<List<Product>>> = _productListState

    /**
     * Mutable value of [uiEvent] this sends oneTime events to UI
     * This value can only be modified within viewModel because it's not correct
     * to be able to access this outside viewModel
     */
    private val _uiEvent = Channel<UiEvent>()



    /**
     * Immutable value of [_uiEvent] this gets observed in UI
     */
    val uiEvent = _uiEvent.receiveAsFlow()


    init {
        preferences.saveShouldShowWelcome(false)
        setUsername()
    }




}