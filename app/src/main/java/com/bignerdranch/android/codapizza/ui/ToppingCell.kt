package com.bignerdranch.android.codapizza.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.bignerdranch.android.codapizza.model.Topping
import com.bignerdranch.android.codapizza.model.ToppingPlacement


@Preview
@Composable
private fun ToppingCellPreview() {
    ToppingCell(
        topping = Topping.Pepperoni,
        placement = ToppingPlacement.Left,
        onClickTopping = {}
    )
}

@Composable
fun ToppingCell(
    topping: Topping,
    placement: ToppingPlacement?,
    onClickTopping: () -> Unit
) {
    Row {
        Checkbox(
            checked = placement != null,
            onCheckedChange = {}
        )

        Column {
            Text(text = stringResource(topping.toppingName))
            Text(text = "Whole Pizza")
        }
    }
}
