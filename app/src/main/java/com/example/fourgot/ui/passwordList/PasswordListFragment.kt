//package com.example.fourgot.ui.passwordList
//
//import androidx.lifecycle.ViewModelProvider
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.viewModels
//import androidx.lifecycle.ViewModel
//import androidx.navigation.fragment.findNavController
//import com.example.fourgot.R
//import com.example.fourgot.data.db.AppDatabase
//import com.example.fourgot.data.db.dao.VaultDAO
//import com.example.fourgot.data.db.entity.VaultEntity
//import com.example.fourgot.repository.DatabaseDataSource
//import com.example.fourgot.repository.VaultRepository
//import com.example.fourgot.ui.password.PasswordViewModel
//import kotlinx.android.synthetic.main.fragment_password_list.*
//
//class PasswordListFragment : Fragment(R.layout.fragment_password_list) {
//
//
//    private val viewModel: PasswordListViewModel by viewModels {
//        object :ViewModelProvider.Factory {
//            override fun <T : ViewModel> create(modelClass: Class<T>): T {
//                val vaultDAO: VaultDAO =
//                    AppDatabase.getInstance(requireContext()).vaultDAO
//
//                val repository: VaultRepository = DatabaseDataSource(vaultDAO)
//                return  PasswordListViewModel(repository) as T
//            }
//        }
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        observeViewModelEvents()
//        configureViewListeners()
//    }
//
//    private fun observeViewModelEvents(){
//        viewModel.allPasswordsEvent.observe(viewLifecycleOwner) {   allPasswords ->
//            val passwordListAdapter = PasswordListAdapter(allPasswords)
//
//            with(recycler_password){
//                setHasFixedSize(true)
//                adapter = passwordListAdapter
//            }
//        }
//    }
//
//    override fun onResume() {
//        super.onResume()
//        viewModel.getPasswords()
//    }
//
//    // transicao de tela
//    private fun configureViewListeners(){
//        fabAddPassword.setOnClickListener{
//            findNavController().navigate(R.id.passwordFragment)
//        }
//    }
//
//}