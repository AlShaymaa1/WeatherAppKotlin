package com.weatherappkotlin.features.randomizer

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.arch.lifecycle.MutableLiveData
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

class RandomizerViewModelTest {
    @JvmField
    @Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    @Test
    fun `init then update number live data value to DEFAULE VALUE`() {

        //Arrange
        //Act
        val viewModel=RandomizerViewModel()

        //Assert
        val  result=viewModel.numberLiveData.value
        Assert.assertTrue(result== DEFAULT_VALUE)

    }

    @Test
    fun `increment number when number live data is DEFAULT_VALUE then update number live data to one`() {

        //Arrange
        val numberLiveData=MutableLiveData<Int>()
        val viewModel=RandomizerViewModel()

        //Act
        numberLiveData.value=0
        viewModel.incrementNumber()


        //Assert
        val  result=viewModel.numberLiveData.value
        assertTrue(result==1)

    }
}