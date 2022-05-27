package com.example.fourgot.ui.passwordList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fourgot.R
import com.example.fourgot.R.id.action_passwordListFragment_to_readFragment
import com.example.fourgot.data.db.entity.VaultEntity
import kotlinx.android.synthetic.main.password_item.view.*

class PasswordListAdapter(
    private val passwords: List<VaultEntity>
) : RecyclerView.Adapter<PasswordListAdapter.PasswordListViewHolder>() {

    var onItemClick: ((entity: VaultEntity) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PasswordListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.password_item, parent, false)

        return PasswordListViewHolder(view)
    }

    override fun onBindViewHolder(holder: PasswordListViewHolder, position: Int) {
        holder.bindView(passwords[position])
    }

    override fun getItemCount() = passwords.size

    inner class PasswordListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val textViewPasswordName: TextView = itemView.input_name
        private val textViewPasswordPassword: TextView = itemView.text_password_password
        private val txtUrl: TextView = itemView.txtUrl
        private val txtEmail: TextView = itemView.txtEmail

        fun bindView(password: VaultEntity) {
            textViewPasswordName.text = password.name
            textViewPasswordPassword.text = password.password
            txtUrl.text = password.url
            txtEmail.text = password.email

            itemView.setOnClickListener{
                onItemClick?.invoke(password)
            }

//            itemView.findNavController().navigate(action_passwordListFragment_to_readFragment)
        }
    }
}