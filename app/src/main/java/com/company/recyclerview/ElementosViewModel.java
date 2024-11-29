package com.company.recyclerview;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class ElementosViewModel extends AndroidViewModel {

    ElementosRepositorio elementosRepositorio;

    MutableLiveData<List<Pokemon>> listElementosMutableLiveData = new MutableLiveData<>();
    MutableLiveData<Pokemon> elementoSeleccionado = new MutableLiveData<>();

    public ElementosViewModel(@NonNull Application application) {
        super(application);

        elementosRepositorio = new ElementosRepositorio();

        listElementosMutableLiveData.setValue(elementosRepositorio.obtener());
    }

    MutableLiveData<List<Pokemon>> obtener(){
        return listElementosMutableLiveData;
    }

    
    
    void seleccionar(Pokemon elemento){
        elementoSeleccionado.setValue(elemento);
    }

    MutableLiveData<Pokemon> seleccionado(){
        return elementoSeleccionado;
    }
}
