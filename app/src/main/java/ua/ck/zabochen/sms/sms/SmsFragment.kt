package ua.ck.zabochen.sms.sms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ua.ck.zabochen.sms.databinding.FargmentSmsBinding

class SmsFragment : Fragment() {

    private var _binding: FargmentSmsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FargmentSmsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initUi() {
    }
}