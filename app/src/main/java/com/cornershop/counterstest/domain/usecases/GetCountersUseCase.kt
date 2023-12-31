package com.cornershop.counterstest.domain.usecases


import com.cornershop.counterstest.data.models.ResultCounter
import com.cornershop.counterstest.data.repository.CounterRepository
import com.cornershop.counterstest.domain.entity.Counter
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCountersUseCase @Inject constructor(private val repository: CounterRepository) {

    operator fun invoke():Flow<ResultCounter> = repository.allCounters()

}